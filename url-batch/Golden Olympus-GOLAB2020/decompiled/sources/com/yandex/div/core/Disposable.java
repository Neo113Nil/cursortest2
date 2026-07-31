package com.yandex.div.core;

import com.yandex.div.core.Disposable;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface Disposable extends AutoCloseable, Closeable {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final Disposable NULL = new Disposable() { // from class: m1.a
        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public final void close() {
            Disposable.NULL$lambda$0();
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void NULL$lambda$0() {
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();
}
