package Q;

import D.g;
import L.C0006d;
import L.InterfaceC0004c;
import L.T;
import N0.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import m.C0245w;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f757a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0004c interfaceC0004c;
        g gVar = inputContentInfo == null ? null : new g(10, new g(9, inputContentInfo));
        k kVar = this.f757a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((g) gVar.f122b).f122b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((g) gVar.f122b).f122b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((g) gVar.f122b).f122b).getDescription();
        g gVar2 = (g) gVar.f122b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) gVar2.f122b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0004c = new g(clipData, 2);
        } else {
            C0006d c0006d = new C0006d();
            c0006d.f512b = clipData;
            c0006d.f513c = 2;
            interfaceC0004c = c0006d;
        }
        interfaceC0004c.c(((InputContentInfo) gVar2.f122b).getLinkUri());
        interfaceC0004c.a(bundle2);
        if (T.h((C0245w) kVar.f657a, interfaceC0004c.k()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
