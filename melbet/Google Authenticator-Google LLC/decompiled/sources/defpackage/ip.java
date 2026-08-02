package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ip extends uw {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ it d;

    public ip(it itVar, int i, int i2, WeakReference weakReference) {
        this.d = itVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.uw
    public final void b(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        it itVar = this.d;
        WeakReference weakReference = this.c;
        if (itVar.c) {
            itVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new mr(textView, typeface, itVar.a, 1));
                } else {
                    it.b(textView, typeface, itVar.a);
                }
            }
        }
    }

    @Override // defpackage.uw
    public final void a(int i) {
    }
}
