package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcb extends bbr {
    @Override // defpackage.bbu
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.bbr
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.bbr
    protected final /* synthetic */ void e(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
