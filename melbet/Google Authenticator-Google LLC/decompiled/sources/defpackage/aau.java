package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aau extends InputConnectionWrapper {
    final /* synthetic */ kee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aau(InputConnection inputConnection, kee keeVar) {
        super(inputConnection, false);
        this.a = keeVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        ClipDescription description;
        Uri contentUri;
        Uri linkUri;
        brn brnVar = inputContentInfo != null ? new brn(new aav(inputContentInfo), (byte[]) null) : null;
        kee keeVar = this.a;
        if ((i & 1) != 0) {
            try {
                ((aav) brnVar.a).a.requestPermission();
                InputContentInfo inputContentInfo2 = ((aav) brnVar.a).a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = ((aav) brnVar.a).a;
        description = inputContentInfo3.getDescription();
        contentUri = inputContentInfo3.getContentUri();
        ClipData clipData = new ClipData(description, new ClipData.Item(contentUri));
        wx wwVar = Build.VERSION.SDK_INT >= 31 ? new ww(clipData, 2) : new wy(clipData, 2);
        Object obj = keeVar.a;
        linkUri = inputContentInfo3.getLinkUri();
        wwVar.d(linkUri);
        wwVar.b(bundle2);
        if (yq.d((View) obj, wwVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
