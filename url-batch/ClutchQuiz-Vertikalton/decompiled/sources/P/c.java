package P;

import A0.h;
import K.C0004e;
import K.InterfaceC0003d;
import K.S;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0243v;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f596a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0003d interfaceC0003d;
        h hVar = inputContentInfo == null ? null : new h(8, new h(7, inputContentInfo));
        b bVar = this.f596a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((h) hVar.f30b).f30b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((h) hVar.f30b).f30b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((h) hVar.f30b).f30b).getDescription();
        h hVar2 = (h) hVar.f30b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) hVar2.f30b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0003d = new h(clipData, 2);
        } else {
            C0004e c0004e = new C0004e();
            c0004e.f387b = clipData;
            c0004e.f388c = 2;
            interfaceC0003d = c0004e;
        }
        interfaceC0003d.d(((InputContentInfo) hVar2.f30b).getLinkUri());
        interfaceC0003d.a(bundle2);
        if (S.h((C0243v) bVar.f595a, interfaceC0003d.j()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
