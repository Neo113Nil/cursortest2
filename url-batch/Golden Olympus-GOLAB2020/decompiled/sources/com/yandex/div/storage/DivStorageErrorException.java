package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivStorageErrorException extends StorageException {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
        
            if (r3 == null) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getMessage(String str, String str2) {
            String str3;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str2 != null) {
                str3 = " Card id: " + str2;
            }
            str3 = "";
            sb.append(str3);
            return sb.toString();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? null : th, (i4 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageErrorException(@NotNull String errorMessage, @Nullable Throwable th, @Nullable String str) {
        super(Companion.getMessage(errorMessage, str), th, str);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
