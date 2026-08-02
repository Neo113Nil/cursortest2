package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fbh extends fbk implements fay, fax {
    private final FileInputStream a;
    private final File b;

    public fbh(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.fax
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.fay
    public final File c() {
        return this.b;
    }
}
