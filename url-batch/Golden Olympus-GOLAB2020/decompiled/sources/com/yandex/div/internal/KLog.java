package com.yandex.div.internal;

import android.support.v4.media.session.b;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class KLog {

    @NotNull
    public static final KLog INSTANCE = new KLog();

    @NotNull
    private static final List<Object> listeners = new ArrayList();

    private KLog() {
    }

    public final boolean isAtLeast(@NotNull Severity minLevel) {
        Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        return Log.isAtLeast(minLevel);
    }

    public final void print(int i4, @NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        android.util.Log.println(i4, tag, message);
        List<Object> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                b.a(it.next());
                throw null;
            }
            Unit unit = Unit.f41027a;
        }
    }
}
