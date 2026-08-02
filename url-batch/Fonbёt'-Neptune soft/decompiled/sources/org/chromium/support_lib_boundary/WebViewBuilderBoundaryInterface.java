package org.chromium.support_lib_boundary;

import B.b;
import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3363a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f3364b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f3365c = new ArrayList();

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(BiConsumer<Integer, Object> biConsumer) {
            accept2(b.m(biConsumer));
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.f3363a.add(obj);
            this.f3364b.add(str);
            this.f3365c.add(list);
        }

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f3363a, this.f3364b, this.f3365c});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
