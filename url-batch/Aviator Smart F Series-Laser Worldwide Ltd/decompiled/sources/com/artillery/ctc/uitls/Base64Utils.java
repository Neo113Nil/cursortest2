package com.artillery.ctc.uitls;

import android.util.Base64;
import androidx.annotation.Keep;
import java.io.File;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Base64Utils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        @Keep
        public final byte[] decodeByString(String data) {
            s.checkNotNullParameter(data, "data");
            byte[] decode = Base64.decode(data, 2);
            s.checkNotNullExpressionValue(decode, "decode(data, Base64.NO_WRAP)");
            return decode;
        }

        @Keep
        public final String encodeToString(File file) {
            byte[] readBytes;
            s.checkNotNullParameter(file, "file");
            if (!FileUtils.isFileExists(file)) {
                return "";
            }
            readBytes = FilesKt__FileReadWriteKt.readBytes(file);
            String encodeToString = Base64.encodeToString(readBytes, 2);
            s.checkNotNullExpressionValue(encodeToString, "{\n                Base64…64.NO_WRAP)\n            }");
            return encodeToString;
        }

        @Keep
        public final String encodeToString(String path) {
            s.checkNotNullParameter(path, "path");
            return encodeToString(new File(path));
        }

        @Keep
        public final String encodeToString(byte[] bytes) {
            s.checkNotNullParameter(bytes, "bytes");
            String encodeToString = Base64.encodeToString(bytes, 2);
            s.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.NO_WRAP)");
            return encodeToString;
        }
    }
}
