package P;

import B0.d;
import K.C0006d;
import K.InterfaceC0004c;
import K.X;
import K0.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0296y;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f697a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0004c interfaceC0004c;
        d dVar = inputContentInfo == null ? null : new d(10, new d(9, inputContentInfo));
        k kVar = this.f697a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((d) dVar.f67b).f67b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((d) dVar.f67b).f67b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((d) dVar.f67b).f67b).getDescription();
        d dVar2 = (d) dVar.f67b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) dVar2.f67b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0004c = new d(clipData, 2);
        } else {
            C0006d c0006d = new C0006d();
            c0006d.f431b = clipData;
            c0006d.f432c = 2;
            interfaceC0004c = c0006d;
        }
        interfaceC0004c.c(((InputContentInfo) dVar2.f67b).getLinkUri());
        interfaceC0004c.a(bundle2);
        if (X.h((C0296y) kVar.f551a, interfaceC0004c.i()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
