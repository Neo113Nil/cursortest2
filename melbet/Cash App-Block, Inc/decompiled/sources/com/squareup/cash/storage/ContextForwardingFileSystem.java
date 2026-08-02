package com.squareup.cash.storage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Path;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class ContextForwardingFileSystem extends ForwardingFileSystem {
    public static final Path ABSOLUTE_ROOT;
    public final Lazy base$delegate;

    static {
        String str = Path.DIRECTORY_SEPARATOR;
        ABSOLUTE_ROOT = Path.Companion.get("/", false);
    }

    public ContextForwardingFileSystem(Context context, Function1 function1) {
        super(FileSystem.SYSTEM);
        this.base$delegate = LazyKt.lazy(new InteractionRuleClient$$ExternalSyntheticLambda0(10, function1, context));
    }

    @Override // okio.ForwardingFileSystem
    public final Path onPathParameter(Path path, String str, String str2) {
        path.getClass();
        if (okio.internal.Path.access$rootLength(path) == -1) {
            String str3 = Path.DIRECTORY_SEPARATOR;
            path = Path.Companion.get("/" + path, false);
        }
        Path path2 = (Path) this.base$delegate.getValue();
        Path relativeTo = path.relativeTo(ABSOLUTE_ROOT);
        path2.getClass();
        return okio.internal.Path.commonResolve(path2, relativeTo, false);
    }

    @Override // okio.ForwardingFileSystem
    public final Path onPathResult(Path path, String str) {
        path.getClass();
        return path.relativeTo((Path) this.base$delegate.getValue());
    }
}
