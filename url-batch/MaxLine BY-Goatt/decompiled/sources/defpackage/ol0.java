package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ol0 implements Sequence<File> {
    public final File a;
    public final FileWalkDirection b;
    public final Function1 c;
    public final Function1 d;
    public final Function2 e;
    public final int f;

    public ol0(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i2 & 2) != 0 ? FileWalkDirection.m : fileWalkDirection;
        i = (i2 & 32) != 0 ? Integer.MAX_VALUE : i;
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function12;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new ml0(this);
    }
}
