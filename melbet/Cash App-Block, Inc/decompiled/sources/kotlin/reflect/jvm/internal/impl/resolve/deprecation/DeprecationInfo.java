package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* loaded from: classes9.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    public int compareTo(DeprecationInfo deprecationInfo) {
        deprecationInfo.getClass();
        int compareTo = getDeprecationLevel().compareTo(deprecationInfo.getDeprecationLevel());
        if (compareTo == 0 && !getPropagatesToOverrides() && deprecationInfo.getPropagatesToOverrides()) {
            return 1;
        }
        return compareTo;
    }

    public abstract DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();
}
