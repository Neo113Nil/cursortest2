package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcj extends bbr {
    @Override // defpackage.bbu
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bbr
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.bbr
    protected final /* synthetic */ void e(Object obj) {
        ((InputStream) obj).close();
    }
}
