package com.yandex.div.data;

import O1.Jd;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.json.templates.InMemoryTemplateProvider;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class DivParsingEnvironment extends TemplateParsingEnvironment<Jd> {

    @NotNull
    private final TemplateParsingEnvironment.TemplateFactory<Jd> templateFactory;

    @NotNull
    private final CachingTemplateProvider<Jd> templates;

    public /* synthetic */ DivParsingEnvironment(ParsingErrorLogger parsingErrorLogger, CachingTemplateProvider cachingTemplateProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingErrorLogger, (i4 & 2) != 0 ? new CachingTemplateProvider(new InMemoryTemplateProvider(), TemplateProvider.Companion.empty()) : cachingTemplateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jd templateFactory$lambda$0(ParsingEnvironment env, boolean z4, JSONObject json) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        return Jd.f3333a.a(env, z4, json);
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment
    @NotNull
    public TemplateParsingEnvironment.TemplateFactory<Jd> getTemplateFactory() {
        return this.templateFactory;
    }

    @Override // com.yandex.div.serialization.ParsingContext
    @NotNull
    public CachingTemplateProvider<Jd> getTemplates() {
        return this.templates;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivParsingEnvironment(@NotNull ParsingErrorLogger logger, @NotNull CachingTemplateProvider<Jd> templateProvider) {
        super(logger, templateProvider);
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(templateProvider, "templateProvider");
        this.templates = templateProvider;
        this.templateFactory = new TemplateParsingEnvironment.TemplateFactory() { // from class: D1.a
            @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
            public final Object create(ParsingEnvironment parsingEnvironment, boolean z4, JSONObject jSONObject) {
                Jd templateFactory$lambda$0;
                templateFactory$lambda$0 = DivParsingEnvironment.templateFactory$lambda$0(parsingEnvironment, z4, jSONObject);
                return templateFactory$lambda$0;
            }
        };
    }
}
