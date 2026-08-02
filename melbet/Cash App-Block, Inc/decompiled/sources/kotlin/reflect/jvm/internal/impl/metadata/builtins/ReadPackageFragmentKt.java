package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class ReadPackageFragmentKt {
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> readBuiltinsPackageFragment(InputStream inputStream) {
        ProtoBuf.PackageFragment packageFragment;
        inputStream.getClass();
        try {
            BuiltInsBinaryVersion readFrom = BuiltInsBinaryVersion.Companion.readFrom(inputStream);
            if (readFrom.isCompatibleWithCurrentCompilerVersion()) {
                ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
                BuiltInsProtoBuf.registerAllExtensions(newInstance);
                packageFragment = ProtoBuf.PackageFragment.parseFrom(inputStream, newInstance);
            } else {
                packageFragment = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pair = new Pair<>(packageFragment, readFrom);
            Utf8.closeFinally(inputStream, null);
            return pair;
        } finally {
        }
    }
}
