package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.commonmark.node.u;

/* loaded from: classes4.dex */
public interface j {

    public interface a {
        @NonNull
        @Deprecated
        <N extends u> a addFactory(@NonNull Class<N> cls, @NonNull s sVar);

        @NonNull
        <N extends u> a appendFactory(@NonNull Class<N> cls, @NonNull s sVar);

        @NonNull
        j build();

        @Nullable
        <N extends u> s getFactory(@NonNull Class<N> cls);

        @NonNull
        <N extends u> a prependFactory(@NonNull Class<N> cls, @NonNull s sVar);

        @NonNull
        <N extends u> s requireFactory(@NonNull Class<N> cls);

        @NonNull
        <N extends u> a setFactory(@NonNull Class<N> cls, @Nullable s sVar);
    }

    @Nullable
    <N extends u> s get(@NonNull Class<N> cls);

    @NonNull
    <N extends u> s require(@NonNull Class<N> cls);
}
