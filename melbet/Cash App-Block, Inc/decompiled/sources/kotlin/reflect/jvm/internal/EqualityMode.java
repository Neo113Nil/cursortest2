package kotlin.reflect.jvm.internal;

import android.content.Context;
import com.google.android.play.core.review.zzi;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.zxing.BinaryBitmap;

/* loaded from: classes4.dex */
public abstract class EqualityMode {

    /* loaded from: classes9.dex */
    public final class JavaSignature extends EqualityMode {
        public static final JavaSignature INSTANCE = new JavaSignature();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof JavaSignature);
        }

        public final int hashCode() {
            return -1427933141;
        }

        public final String toString() {
            return "JavaSignature";
        }
    }

    /* loaded from: classes9.dex */
    public final class KotlinSignature extends EqualityMode {
        public static final KotlinSignature INSTANCE = new KotlinSignature();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KotlinSignature);
        }

        public final int hashCode() {
            return -773436692;
        }

        public final String toString() {
            return "KotlinSignature";
        }
    }

    public static String escapeBytes(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static BinaryBitmap provideReviewManager$real(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new BinaryBitmap(new zzi(context));
    }
}
