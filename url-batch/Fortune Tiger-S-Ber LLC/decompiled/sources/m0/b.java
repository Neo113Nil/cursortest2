package m0;

import a2.e;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import j2.z;
import k.u;
import k0.c;
import k0.d;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f2904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, z zVar) {
        super(inputConnection, false);
        this.f2904a = zVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        Bundle bundle2;
        c cVar;
        e eVar = inputContentInfo == null ? null : new e(26, new e(25, inputContentInfo));
        u uVar = (u) this.f2904a.f2399f;
        if ((i4 & 1) != 0) {
            try {
                ((InputContentInfo) ((e) eVar.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((e) eVar.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e4) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e4);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((e) eVar.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new e(clipData, 2);
        } else {
            d dVar = new d();
            dVar.g = clipData;
            dVar.h = 2;
            cVar = dVar;
        }
        cVar.p(inputContentInfo3.getLinkUri());
        cVar.setExtras(bundle2);
        if (j0.i(uVar, cVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i4, bundle);
    }
}
