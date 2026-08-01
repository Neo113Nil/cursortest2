package p0;

import a.g0;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.t;
import n0.c;
import n0.d;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f3054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, g0 g0Var) {
        super(inputConnection, false);
        this.f3054a = g0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        c cVar;
        a0.a aVar = inputContentInfo == null ? null : new a0.a(29, new a0.a(28, inputContentInfo));
        t tVar = (t) this.f3054a.f25g;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((a0.a) aVar.f79g).f79g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((a0.a) aVar.f79g).f79g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((a0.a) aVar.f79g).f79g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new a0.a(clipData, 2);
        } else {
            d dVar = new d();
            dVar.f2766g = clipData;
            dVar.h = 2;
            cVar = dVar;
        }
        cVar.w(inputContentInfo3.getLinkUri());
        cVar.setExtras(bundle2);
        if (p0.i(tVar, cVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
