package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class NotificationLite {
    public static final /* synthetic */ NotificationLite[] $VALUES;
    public static final NotificationLite COMPLETE;

    public final class DisposableNotification implements Serializable {
        public final Disposable upstream;

        public DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public final class ErrorNotification implements Serializable {
        public final Throwable e;

        public ErrorNotification(Throwable th) {
            this.e = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.e, ((ErrorNotification) obj).e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.e + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        COMPLETE = notificationLite;
        $VALUES = new NotificationLite[]{notificationLite};
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
