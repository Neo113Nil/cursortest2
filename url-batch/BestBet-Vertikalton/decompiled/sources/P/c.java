package P;

import K.C0008d;
import K.InterfaceC0007c;
import K.Q;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0264v;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f858a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0007c interfaceC0007c;
        A0.c cVar = inputContentInfo == null ? null : new A0.c(12, new A0.c(11, inputContentInfo));
        b bVar = this.f858a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((A0.c) cVar.f6b).f6b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((A0.c) cVar.f6b).f6b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((A0.c) cVar.f6b).f6b).getDescription();
        A0.c cVar2 = (A0.c) cVar.f6b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) cVar2.f6b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0007c = new A0.c(clipData, 2);
        } else {
            C0008d c0008d = new C0008d();
            c0008d.f601b = clipData;
            c0008d.f602c = 2;
            interfaceC0007c = c0008d;
        }
        interfaceC0007c.b(((InputContentInfo) cVar2.f6b).getLinkUri());
        interfaceC0007c.a(bundle2);
        if (Q.h((C0264v) bVar.f857a, interfaceC0007c.h()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
