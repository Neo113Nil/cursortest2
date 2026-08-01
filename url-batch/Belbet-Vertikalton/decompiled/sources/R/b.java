package R;

import C1.d;
import M.C0008d;
import M.InterfaceC0007c;
import M.P;
import Q0.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import n.C0306w;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f1115a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0007c interfaceC0007c;
        d dVar = inputContentInfo == null ? null : new d(12, new d(11, inputContentInfo));
        k kVar = this.f1115a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((d) dVar.f145b).f145b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((d) dVar.f145b).f145b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((d) dVar.f145b).f145b).getDescription();
        d dVar2 = (d) dVar.f145b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) dVar2.f145b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0007c = new d(clipData, 2);
        } else {
            C0008d c0008d = new C0008d();
            c0008d.f735b = clipData;
            c0008d.f736c = 2;
            interfaceC0007c = c0008d;
        }
        interfaceC0007c.c(((InputContentInfo) dVar2.f145b).getLinkUri());
        interfaceC0007c.a(bundle2);
        if (P.h((C0306w) kVar.f1023a, interfaceC0007c.h()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
