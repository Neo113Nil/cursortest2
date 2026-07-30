package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.b;
import io.noties.markwon.g;
import io.noties.markwon.i;
import io.noties.markwon.j;
import io.noties.markwon.l;
import org.commonmark.node.u;
import org.commonmark.parser.d;

/* loaded from: classes4.dex */
public abstract class a implements i {
    @Override // io.noties.markwon.i
    public void afterRender(@NonNull u uVar, @NonNull l lVar) {
    }

    @Override // io.noties.markwon.i
    public void afterSetText(@NonNull TextView textView) {
    }

    @Override // io.noties.markwon.i
    public void beforeRender(@NonNull u uVar) {
    }

    @Override // io.noties.markwon.i
    public void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
    }

    @Override // io.noties.markwon.i
    public void configure(@NonNull i.b bVar) {
    }

    @Override // io.noties.markwon.i
    public void configureConfiguration(@NonNull g.b bVar) {
    }

    @Override // io.noties.markwon.i
    public void configureParser(@NonNull d.b bVar) {
    }

    @Override // io.noties.markwon.i
    public void configureSpansFactory(@NonNull j.a aVar) {
    }

    @Override // io.noties.markwon.i
    public void configureTheme(@NonNull b.a aVar) {
    }

    @Override // io.noties.markwon.i
    public void configureVisitor(@NonNull l.b bVar) {
    }

    @Override // io.noties.markwon.i
    @NonNull
    public String processMarkdown(@NonNull String str) {
        return str;
    }
}
