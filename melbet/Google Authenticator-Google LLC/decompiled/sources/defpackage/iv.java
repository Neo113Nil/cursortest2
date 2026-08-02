package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iv extends iu {
    final /* synthetic */ AppCompatTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.b = appCompatTextView;
    }

    @Override // defpackage.iu
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.iu
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
