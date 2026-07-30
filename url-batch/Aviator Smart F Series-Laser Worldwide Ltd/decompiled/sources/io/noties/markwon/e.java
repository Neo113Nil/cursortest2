package io.noties.markwon;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
public abstract class e {

    public interface a {
        @NonNull
        a bufferType(@NonNull TextView.BufferType bufferType);

        @NonNull
        e build();

        @NonNull
        a fallbackToRawInputWhenEmpty(boolean z7);

        @NonNull
        a textSetter(@NonNull b bVar);

        @NonNull
        a usePlugin(@NonNull i iVar);

        @NonNull
        a usePlugins(@NonNull Iterable<? extends i> iterable);
    }

    public interface b {
    }

    @NonNull
    public static a builder(@NonNull Context context) {
        return new f(context).usePlugin(io.noties.markwon.core.a.create());
    }

    @NonNull
    public static a builderNoCore(@NonNull Context context) {
        return new f(context);
    }

    @NonNull
    public static e create(@NonNull Context context) {
        return builder(context).usePlugin(io.noties.markwon.core.a.create()).build();
    }

    @NonNull
    public abstract g configuration();

    @Nullable
    public abstract <P extends i> P getPlugin(@NonNull Class<P> cls);

    @NonNull
    public abstract List<? extends i> getPlugins();

    public abstract boolean hasPlugin(@NonNull Class<? extends i> cls);

    @NonNull
    public abstract u parse(@NonNull String str);

    @NonNull
    public abstract Spanned render(@NonNull u uVar);

    @NonNull
    public abstract <P extends i> P requirePlugin(@NonNull Class<P> cls);

    public abstract void setMarkdown(@NonNull TextView textView, @NonNull String str);

    public abstract void setParsedMarkdown(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    public abstract Spanned toMarkdown(@NonNull String str);
}
