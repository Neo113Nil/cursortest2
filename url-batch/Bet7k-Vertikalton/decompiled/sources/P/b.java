package P;

import B0.d;
import K.C0004d;
import K.InterfaceC0003c;
import K.T;
import K0.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0268x;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f619a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0003c interfaceC0003c;
        d dVar = inputContentInfo == null ? null : new d(11, new d(10, inputContentInfo));
        k kVar = this.f619a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((d) dVar.f59b).f59b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((d) dVar.f59b).f59b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((d) dVar.f59b).f59b).getDescription();
        d dVar2 = (d) dVar.f59b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) dVar2.f59b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0003c = new d(clipData, 2);
        } else {
            C0004d c0004d = new C0004d();
            c0004d.f396b = clipData;
            c0004d.f397c = 2;
            interfaceC0003c = c0004d;
        }
        interfaceC0003c.b(((InputContentInfo) dVar2.f59b).getLinkUri());
        interfaceC0003c.a(bundle2);
        if (T.h((C0268x) kVar.f501a, interfaceC0003c.g()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
