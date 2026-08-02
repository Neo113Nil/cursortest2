package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pp implements DialogInterface.OnClickListener {
    private final WeakReference a;
    private final /* synthetic */ int b;

    public pp(pq pqVar, int i, byte[] bArr) {
        this.b = i;
        this.a = new WeakReference(pqVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        WeakReference weakReference = this.a;
        if (i2 != 0) {
            if (weakReference.get() != null) {
                ((pq) weakReference.get()).m(true);
            }
        } else if (weakReference.get() != null) {
            ((pq) weakReference.get()).n(true);
        }
    }

    public pp(pq pqVar, int i) {
        this.b = i;
        this.a = new WeakReference(pqVar);
    }
}
