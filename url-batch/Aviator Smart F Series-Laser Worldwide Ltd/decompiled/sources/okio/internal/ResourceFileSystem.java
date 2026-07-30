package okio.internal;

import cn.hutool.core.util.g1;
import f6.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okio.i;
import okio.j;
import okio.k;
import okio.o0;
import okio.v0;
import okio.x0;

/* loaded from: classes5.dex */
public final class ResourceFileSystem extends k {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final o0 ROOT = o0.a.get$default(o0.Companion, "/", false, 1, (Object) null);
    private final y5.f roots$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(o0 o0Var) {
            return !t.endsWith(o0Var.name(), ".class", true);
        }

        public final o0 getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final o0 removeBase(o0 o0Var, o0 base) {
            String removePrefix;
            String replace$default;
            s.checkNotNullParameter(o0Var, "<this>");
            s.checkNotNullParameter(base, "base");
            String o0Var2 = base.toString();
            o0 root = getROOT();
            removePrefix = StringsKt__StringsKt.removePrefix(o0Var.toString(), (CharSequence) o0Var2);
            replace$default = t.replace$default(removePrefix, cn.hutool.core.io.file.c.WINDOWS_SEPARATOR, cn.hutool.core.io.file.c.UNIX_SEPARATOR, false, 4, (Object) null);
            return root.resolve(replace$default);
        }

        public final List<Pair<k, o0>> toClasspathRoots(ClassLoader classLoader) {
            s.checkNotNullParameter(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            s.checkNotNullExpressionValue(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            s.checkNotNullExpressionValue(list, "java.util.Collections.list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                Companion companion = ResourceFileSystem.Companion;
                s.checkNotNullExpressionValue(it, "it");
                Pair<k, o0> fileRoot = companion.toFileRoot(it);
                if (fileRoot != null) {
                    arrayList.add(fileRoot);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            s.checkNotNullExpressionValue(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            s.checkNotNullExpressionValue(list2, "java.util.Collections.list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                Companion companion2 = ResourceFileSystem.Companion;
                s.checkNotNullExpressionValue(it2, "it");
                Pair<k, o0> jarRoot = companion2.toJarRoot(it2);
                if (jarRoot != null) {
                    arrayList2.add(jarRoot);
                }
            }
            return CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        }

        public final Pair<k, o0> toFileRoot(URL url) {
            s.checkNotNullParameter(url, "<this>");
            if (s.areEqual(url.getProtocol(), g1.URL_PROTOCOL_FILE)) {
                return y5.h.to(k.SYSTEM, o0.a.get$default(o0.Companion, new File(url.toURI()), false, 1, (Object) null));
            }
            return null;
        }

        public final Pair<k, o0> toJarRoot(URL url) {
            int lastIndexOf$default;
            s.checkNotNullParameter(url, "<this>");
            String url2 = url.toString();
            s.checkNotNullExpressionValue(url2, "toString()");
            if (!t.startsWith$default(url2, "jar:file:", false, 2, null) || (lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url2, "!", 0, false, 6, (Object) null)) == -1) {
                return null;
            }
            o0.a aVar = o0.Companion;
            String substring = url2.substring(4, lastIndexOf$default);
            s.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return y5.h.to(ZipKt.openZip(o0.a.get$default(aVar, new File(URI.create(substring)), false, 1, (Object) null), k.SYSTEM, new l() { // from class: okio.internal.ResourceFileSystem$Companion$toJarRoot$zip$1
                @Override // f6.l
                public final Boolean invoke(c entry) {
                    s.checkNotNullParameter(entry, "entry");
                    return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
                }
            }), getROOT());
        }
    }

    public ResourceFileSystem(final ClassLoader classLoader, boolean z7) {
        y5.f lazy;
        s.checkNotNullParameter(classLoader, "classLoader");
        lazy = kotlin.b.lazy(new f6.a() { // from class: okio.internal.ResourceFileSystem$roots$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final List<Pair<k, o0>> invoke() {
                return ResourceFileSystem.Companion.toClasspathRoots(classLoader);
            }
        });
        this.roots$delegate = lazy;
        if (z7) {
            getRoots().size();
        }
    }

    private final o0 canonicalizeInternal(o0 o0Var) {
        return ROOT.resolve(o0Var, true);
    }

    private final List<Pair<k, o0>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    private final String toRelativePath(o0 o0Var) {
        return canonicalizeInternal(o0Var).relativeTo(ROOT).toString();
    }

    @Override // okio.k
    public v0 appendingSink(o0 file, boolean z7) {
        s.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public void atomicMove(o0 source, o0 target) {
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public o0 canonicalize(o0 path) {
        s.checkNotNullParameter(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.k
    public void createDirectory(o0 dir, boolean z7) {
        s.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public void createSymlink(o0 source, o0 target) {
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public void delete(o0 path, boolean z7) {
        s.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public List<o0> list(o0 dir) {
        s.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z7 = false;
        for (Pair<k, o0> pair : getRoots()) {
            k component1 = pair.component1();
            o0 component2 = pair.component2();
            try {
                List<o0> list = component1.list(component2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((o0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((o0) it.next(), component2));
                }
                v.addAll(linkedHashSet, arrayList2);
                z7 = true;
            } catch (IOException unused) {
            }
        }
        if (z7) {
            return CollectionsKt___CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException(s.stringPlus("file not found: ", dir));
    }

    @Override // okio.k
    public List<o0> listOrNull(o0 dir) {
        s.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<k, o0>> it = getRoots().iterator();
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<k, o0> next = it.next();
            k component1 = next.component1();
            o0 component2 = next.component2();
            List<o0> listOrNull = component1.listOrNull(component2.resolve(relativePath));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (Companion.keepPath((o0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((o0) it2.next(), component2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                v.addAll(linkedHashSet, arrayList);
                z7 = true;
            }
        }
        if (z7) {
            return CollectionsKt___CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.k
    public j metadataOrNull(o0 path) {
        s.checkNotNullParameter(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<k, o0> pair : getRoots()) {
            j metadataOrNull = pair.component1().metadataOrNull(pair.component2().resolve(relativePath));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.k
    public i openReadOnly(o0 file) {
        s.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(s.stringPlus("file not found: ", file));
        }
        String relativePath = toRelativePath(file);
        for (Pair<k, o0> pair : getRoots()) {
            try {
                return pair.component1().openReadOnly(pair.component2().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(s.stringPlus("file not found: ", file));
    }

    @Override // okio.k
    public i openReadWrite(o0 file, boolean z7, boolean z8) {
        s.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.k
    public v0 sink(o0 file, boolean z7) {
        s.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.k
    public x0 source(o0 file) {
        s.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(s.stringPlus("file not found: ", file));
        }
        String relativePath = toRelativePath(file);
        for (Pair<k, o0> pair : getRoots()) {
            try {
                return pair.component1().source(pair.component2().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(s.stringPlus("file not found: ", file));
    }
}
