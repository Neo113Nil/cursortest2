package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public interface DeclaredMemberIndex {
    JavaField findFieldByName(Name name);

    Collection<JavaMethod> findMethodsByName(Name name);

    JavaRecordComponent findRecordComponentByName(Name name);

    Set<Name> getFieldNames();

    Set<Name> getMethodNames();

    Set<Name> getRecordComponentNames();

    public static final class Empty implements DeclaredMemberIndex {
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public JavaField findFieldByName(Name name) {
            name.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public JavaRecordComponent findRecordComponentByName(Name name) {
            name.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getFieldNames() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getMethodNames() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Set<Name> getRecordComponentNames() {
            return EmptySet.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public List<JavaMethod> findMethodsByName(Name name) {
            name.getClass();
            return EmptyList.INSTANCE;
        }
    }
}
