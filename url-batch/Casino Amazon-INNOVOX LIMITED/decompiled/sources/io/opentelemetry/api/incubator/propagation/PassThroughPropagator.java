package io.opentelemetry.api.incubator.propagation;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextKey;
import io.opentelemetry.context.propagation.TextMapGetter;
import io.opentelemetry.context.propagation.TextMapPropagator;
import io.opentelemetry.context.propagation.TextMapSetter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class PassThroughPropagator implements TextMapPropagator {
    private static final ContextKey<List<String>> EXTRACTED_KEY_VALUES = ContextKey.named("passthroughpropagator-keyvalues");
    private final List<String> fields;

    private PassThroughPropagator(List<String> list) {
        this.fields = Collections.unmodifiableList(list);
    }

    public static TextMapPropagator create(String... strArr) {
        Objects.requireNonNull(strArr, "fields");
        return create(Arrays.asList(strArr));
    }

    public static TextMapPropagator create(Iterable<String> iterable) {
        Objects.requireNonNull(iterable, "fields");
        List list = (List) StreamSupport.stream(iterable.spliterator(), false).map(new Function() { // from class: io.opentelemetry.api.incubator.propagation.PassThroughPropagator$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PassThroughPropagator.lambda$create$0((String) obj);
            }
        }).collect(Collectors.toList());
        if (list.isEmpty()) {
            return TextMapPropagator.noop();
        }
        return new PassThroughPropagator(list);
    }

    static /* synthetic */ String lambda$create$0(String str) {
        return (String) Objects.requireNonNull(str, "field");
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public Collection<String> fields() {
        return this.fields;
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> void inject(Context context, @Nullable C c, TextMapSetter<C> textMapSetter) {
        List list = (List) context.get(EXTRACTED_KEY_VALUES);
        if (list != null) {
            for (int i = 0; i < list.size(); i += 2) {
                textMapSetter.set(c, (String) list.get(i), (String) list.get(i + 1));
            }
        }
    }

    @Override // io.opentelemetry.context.propagation.TextMapPropagator
    public <C> Context extract(Context context, @Nullable C c, TextMapGetter<C> textMapGetter) {
        ArrayList arrayList = null;
        for (String str : this.fields) {
            String str2 = textMapGetter.get(c, str);
            if (str2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(str);
                arrayList.add(str2);
            }
        }
        return arrayList != null ? context.with(EXTRACTED_KEY_VALUES, arrayList) : context;
    }

    public String toString() {
        return "PassThroughPropagator{fields=" + this.fields + "}";
    }
}
