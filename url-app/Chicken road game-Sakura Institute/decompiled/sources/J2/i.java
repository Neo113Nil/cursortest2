package J2;

import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

@Metadata
/* loaded from: classes.dex */
public final class i implements Sequence<File> {

    /* renamed from: a, reason: collision with root package name */
    public final File f3406a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f3407b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f3408c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f3409d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f3410e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3411f;

    public i(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i4 & 2) != 0 ? FileWalkDirection.f7499d : fileWalkDirection;
        i2 = (i4 & 32) != 0 ? Integer.MAX_VALUE : i2;
        this.f3406a = file;
        this.f3407b = fileWalkDirection;
        this.f3408c = function1;
        this.f3409d = function12;
        this.f3410e = function2;
        this.f3411f = i2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new g(this);
    }
}
