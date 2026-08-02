package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbi extends fbl implements fay, fax, fbf {
    private final FileOutputStream a;
    private final File b;

    public fbi(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.fax
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.fbf
    public final void b() {
        this.a.getFD().sync();
    }

    @Override // defpackage.fay
    public final File c() {
        return this.b;
    }
}
