package org.asyncstorage.shared_storage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StorageException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\t\nB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lorg/asyncstorage/shared_storage/StorageException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "SqliteException", "OtherException", "Lorg/asyncstorage/shared_storage/StorageException$OtherException;", "Lorg/asyncstorage/shared_storage/StorageException$SqliteException;", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class StorageException extends Exception {
    public /* synthetic */ StorageException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    private StorageException(String str, Throwable th) {
        super(str, th);
    }

    /* compiled from: StorageException.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/asyncstorage/shared_storage/StorageException$SqliteException;", "Lorg/asyncstorage/shared_storage/StorageException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SqliteException extends StorageException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SqliteException(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: StorageException.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/asyncstorage/shared_storage/StorageException$OtherException;", "Lorg/asyncstorage/shared_storage/StorageException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OtherException extends StorageException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherException(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }
}
