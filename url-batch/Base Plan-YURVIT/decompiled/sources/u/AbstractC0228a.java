package u;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0228a {
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
