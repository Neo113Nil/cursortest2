package P;

import C.h;
import K.C0003d;
import K.InterfaceC0002c;
import K.S;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0241v;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f582a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0002c interfaceC0002c;
        h hVar = inputContentInfo == null ? null : new h(10, new h(9, inputContentInfo));
        b bVar = this.f582a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((h) hVar.f150b).f150b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((h) hVar.f150b).f150b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((h) hVar.f150b).f150b).getDescription();
        h hVar2 = (h) hVar.f150b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) hVar2.f150b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0002c = new h(clipData, 2);
        } else {
            C0003d c0003d = new C0003d();
            c0003d.f370b = clipData;
            c0003d.f371c = 2;
            interfaceC0002c = c0003d;
        }
        interfaceC0002c.d(((InputContentInfo) hVar2.f150b).getLinkUri());
        interfaceC0002c.a(bundle2);
        if (S.h((C0241v) bVar.f581a, interfaceC0002c.k()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
