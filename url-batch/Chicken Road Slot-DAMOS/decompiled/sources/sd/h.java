package sd;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final File f9184a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f9185b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f9186c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f9187d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f9188e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9189f;

    public h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i10 & 2) != 0 ? FileWalkDirection.f5593d : fileWalkDirection;
        i3 = (i10 & 32) != 0 ? Integer.MAX_VALUE : i3;
        this.f9184a = file;
        this.f9185b = fileWalkDirection;
        this.f9186c = function1;
        this.f9187d = function12;
        this.f9188e = function2;
        this.f9189f = i3;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
