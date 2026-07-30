package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
class h extends e {
    private final TextView.BufferType bufferType;
    private final g configuration;
    private final boolean fallbackToRawInputWhenEmpty;
    private final org.commonmark.parser.d parser;
    private final List<i> plugins;

    @Nullable
    private final e.b textSetter;
    private final m visitorFactory;

    h(@NonNull TextView.BufferType bufferType, @Nullable e.b bVar, @NonNull org.commonmark.parser.d dVar, @NonNull m mVar, @NonNull g gVar, @NonNull List<i> list, boolean z7) {
        this.bufferType = bufferType;
        this.parser = dVar;
        this.visitorFactory = mVar;
        this.configuration = gVar;
        this.plugins = list;
        this.fallbackToRawInputWhenEmpty = z7;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public g configuration() {
        return this.configuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [io.noties.markwon.i, java.lang.Object] */
    @Override // io.noties.markwon.e
    @Nullable
    public <P extends i> P getPlugin(@NonNull Class<P> cls) {
        P p8 = null;
        for (i iVar : this.plugins) {
            if (cls.isAssignableFrom(iVar.getClass())) {
                p8 = iVar;
            }
        }
        return p8;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public List<? extends i> getPlugins() {
        return Collections.unmodifiableList(this.plugins);
    }

    @Override // io.noties.markwon.e
    public boolean hasPlugin(@NonNull Class<? extends i> cls) {
        return getPlugin(cls) != null;
    }

    @Override // io.noties.markwon.e
    @NonNull
    public u parse(@NonNull String str) {
        Iterator<i> it = this.plugins.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.parser.parse(str);
    }

    @Override // io.noties.markwon.e
    @NonNull
    public Spanned render(@NonNull u uVar) {
        Iterator<i> it = this.plugins.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(uVar);
        }
        l create = this.visitorFactory.create();
        uVar.accept(create);
        Iterator<i> it2 = this.plugins.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(uVar, create);
        }
        return create.builder().spannableStringBuilder();
    }

    @Override // io.noties.markwon.e
    @NonNull
    public <P extends i> P requirePlugin(@NonNull Class<P> cls) {
        P p8 = (P) getPlugin(cls);
        if (p8 != null) {
            return p8;
        }
        throw new IllegalStateException(String.format(Locale.US, "Requested plugin `%s` is not registered with this Markwon instance", cls.getName()));
    }

    @Override // io.noties.markwon.e
    public void setMarkdown(@NonNull TextView textView, @NonNull String str) {
        setParsedMarkdown(textView, toMarkdown(str));
    }

    @Override // io.noties.markwon.e
    public void setParsedMarkdown(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<i> it = this.plugins.iterator();
        while (it.hasNext()) {
            it.next().beforeSetText(textView, spanned);
        }
        textView.setText(spanned, this.bufferType);
        Iterator<i> it2 = this.plugins.iterator();
        while (it2.hasNext()) {
            it2.next().afterSetText(textView);
        }
    }

    @Override // io.noties.markwon.e
    @NonNull
    public Spanned toMarkdown(@NonNull String str) {
        Spanned render = render(parse(str));
        return (TextUtils.isEmpty(render) && this.fallbackToRawInputWhenEmpty && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : render;
    }
}
