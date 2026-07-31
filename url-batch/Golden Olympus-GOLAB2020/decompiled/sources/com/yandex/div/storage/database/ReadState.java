package com.yandex.div.storage.database;

import android.database.Cursor;
import com.yandex.div.internal.util.IOUtils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ReadState implements Closeable, AutoCloseable {

    @Nullable
    private Cursor _cursor;

    @NotNull
    private final V1.a cursorProvider;

    @NotNull
    private final Function0<Unit> onCloseState;

    @Metadata
    /* renamed from: com.yandex.div.storage.database.ReadState$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m234invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m234invoke();
            return Unit.f41027a;
        }
    }

    public ReadState(@NotNull Function0<Unit> onCloseState, @NotNull V1.a cursorProvider) {
        Intrinsics.checkNotNullParameter(onCloseState, "onCloseState");
        Intrinsics.checkNotNullParameter(cursorProvider, "cursorProvider");
        this.onCloseState = onCloseState;
        this.cursorProvider = cursorProvider;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.closeCursorSilently(this._cursor);
        this.onCloseState.invoke();
    }

    @NotNull
    public final Cursor getCursor() {
        if (this._cursor != null) {
            throw new RuntimeException("Cursor should be called only once");
        }
        Cursor c4 = (Cursor) this.cursorProvider.get();
        this._cursor = c4;
        Intrinsics.checkNotNullExpressionValue(c4, "c");
        return c4;
    }

    public /* synthetic */ ReadState(Function0 function0, V1.a aVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? AnonymousClass1.INSTANCE : function0, aVar);
    }
}
