package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.sa;
import defpackage.sd;
import defpackage.tb;
import defpackage.tr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Barrier extends tb {
    public int a;
    public sa b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.tb
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.b = new sa();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = obtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = obtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = obtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r4 == 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r4 == 6) goto L5;
     */
    @Override // defpackage.tb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(sd sdVar, boolean z) {
        int i = this.a;
        if (z) {
            if (i != 5) {
            }
            i = 1;
        } else {
            if (i != 5) {
            }
            i = 0;
        }
        if (sdVar instanceof sa) {
            ((sa) sdVar).a = i;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
