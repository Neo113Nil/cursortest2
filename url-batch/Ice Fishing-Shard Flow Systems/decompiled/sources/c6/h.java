package c6;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class h implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final File f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f4271b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f4272c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f4273d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f4274e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4275f;

    public h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i5 & 2) != 0 ? FileWalkDirection.f6147d : fileWalkDirection;
        i2 = (i5 & 32) != 0 ? Integer.MAX_VALUE : i2;
        this.f4270a = file;
        this.f4271b = fileWalkDirection;
        this.f4272c = function1;
        this.f4273d = function12;
        this.f4274e = function2;
        this.f4275f = i2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
