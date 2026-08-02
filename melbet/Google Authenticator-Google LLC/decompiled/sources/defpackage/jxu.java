package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxu {
    public final boolean a;
    public final Object b;

    public jxu(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public final hvi a(Callable callable, Executor executor) {
        return new hue((heb) this.b, this.a, executor, callable);
    }

    public final hvi b(htq htqVar, Executor executor) {
        return new hue((heb) this.b, this.a, executor, htqVar);
    }

    public final boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.b != null) {
            char c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c = 2;
                                break;
                        }
                    }
                    c = 0;
                }
                c = 1;
            }
            if (c == 0) {
                return true;
            }
            if (c == 1) {
                return false;
            }
        }
        return this.a;
    }

    public jxu(boolean z, hel helVar) {
        this.a = z;
        this.b = helVar;
    }

    public jxu(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
