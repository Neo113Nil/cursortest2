package com.yandex.div.json;

import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ParsingEnvironmentImpl;
import com.yandex.div.internal.parser.TemplateParsingErrorLogger;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class TemplateParsingEnvironment<T extends JsonTemplate<?>> implements ParsingEnvironment {

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final CachingTemplateProvider<T> mainTemplateProvider;

    @NotNull
    private final TemplateProvider<T> templates;

    @Metadata
    public interface TemplateFactory<T> {
        T create(@NotNull ParsingEnvironment parsingEnvironment, boolean z4, @NotNull JSONObject jSONObject);
    }

    @Metadata
    public static final class TemplateParsingResult<T> {

        @NotNull
        private final Map<String, T> parsedTemplates;

        @NotNull
        private final Map<String, Set<String>> templateDependencies;

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateParsingResult(@NotNull Map<String, ? extends T> parsedTemplates, @NotNull Map<String, ? extends Set<String>> templateDependencies) {
            Intrinsics.checkNotNullParameter(parsedTemplates, "parsedTemplates");
            Intrinsics.checkNotNullParameter(templateDependencies, "templateDependencies");
            this.parsedTemplates = parsedTemplates;
            this.templateDependencies = templateDependencies;
        }

        @NotNull
        public final Map<String, T> getParsedTemplates() {
            return this.parsedTemplates;
        }
    }

    public TemplateParsingEnvironment(@NotNull ParsingErrorLogger logger, @NotNull CachingTemplateProvider<T> mainTemplateProvider) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(mainTemplateProvider, "mainTemplateProvider");
        this.logger = logger;
        this.mainTemplateProvider = mainTemplateProvider;
        this.templates = mainTemplateProvider;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public ParsingErrorLogger getLogger() {
        return this.logger;
    }

    @NotNull
    public abstract TemplateFactory<T> getTemplateFactory();

    public final void parseTemplates(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.mainTemplateProvider.putAll(parseTemplatesWithResult(json));
    }

    @NotNull
    public final Map<String, T> parseTemplatesWithResult(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return parseTemplatesWithResultAndDependencies(json).getParsedTemplates();
    }

    @NotNull
    public final TemplateParsingResult<T> parseTemplatesWithResultAndDependencies(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Map<String, T> arrayMap = CollectionsKt.arrayMap();
        Map arrayMap2 = CollectionsKt.arrayMap();
        try {
            Map<String, Set<String>> sort = JsonTopologicalSorting.INSTANCE.sort(this, json);
            this.mainTemplateProvider.takeSnapshot(arrayMap);
            TemplateProvider wrap = TemplateProvider.Companion.wrap(arrayMap);
            for (Map.Entry<String, Set<String>> entry : sort.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                try {
                    ParsingEnvironmentImpl parsingEnvironmentImpl = new ParsingEnvironmentImpl(wrap, new TemplateParsingErrorLogger(getLogger(), key));
                    TemplateFactory<T> templateFactory = getTemplateFactory();
                    JSONObject jSONObject = json.getJSONObject(key);
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(name)");
                    arrayMap.put(key, templateFactory.create(parsingEnvironmentImpl, true, jSONObject));
                    if (!value.isEmpty()) {
                        arrayMap2.put(key, value);
                    }
                } catch (ParsingException e4) {
                    getLogger().logTemplateError(e4, key);
                }
            }
        } catch (Exception e5) {
            getLogger().logError(e5);
        }
        return new TemplateParsingResult<>(arrayMap, arrayMap2);
    }
}
