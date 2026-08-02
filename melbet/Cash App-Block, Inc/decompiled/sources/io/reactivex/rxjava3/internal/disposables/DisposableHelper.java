package io.reactivex.rxjava3.internal.disposables;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class DisposableHelper implements Disposable {
    public static final /* synthetic */ DisposableHelper[] $VALUES;
    public static final DisposableHelper DISPOSED;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        DISPOSED = disposableHelper;
        $VALUES = new DisposableHelper[]{disposableHelper};
    }

    public static void dispose(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable2 == disposableHelper || (disposable = (Disposable) atomicReference.getAndSet(disposableHelper)) == disposableHelper || disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public static boolean replace(AtomicReference atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(disposable2, disposable)) {
                if (atomicReference.get() != disposable2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference atomicReference, Disposable disposable) {
        Objects.requireNonNull(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                UnsignedBytes.onError(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean validate(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            UnsignedBytes.onError(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        UnsignedBytes.onError(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }
}
