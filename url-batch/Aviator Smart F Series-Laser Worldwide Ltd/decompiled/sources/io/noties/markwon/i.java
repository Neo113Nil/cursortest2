package io.noties.markwon;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.b;
import io.noties.markwon.g;
import io.noties.markwon.j;
import io.noties.markwon.l;
import org.commonmark.node.u;
import org.commonmark.parser.d;

/* loaded from: classes4.dex */
public interface i {

    public interface a {
        void a(i iVar);
    }

    public interface b {
        @NonNull
        <P extends i> P require(@NonNull Class<P> cls);

        <P extends i> void require(@NonNull Class<P> cls, @NonNull a aVar);
    }

    void afterRender(@NonNull u uVar, @NonNull l lVar);

    void afterSetText(@NonNull TextView textView);

    void beforeRender(@NonNull u uVar);

    void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned);

    void configure(@NonNull b bVar);

    void configureConfiguration(@NonNull g.b bVar);

    void configureParser(@NonNull d.b bVar);

    void configureSpansFactory(@NonNull j.a aVar);

    void configureTheme(@NonNull b.a aVar);

    void configureVisitor(@NonNull l.b bVar);

    @NonNull
    String processMarkdown(@NonNull String str);
}
