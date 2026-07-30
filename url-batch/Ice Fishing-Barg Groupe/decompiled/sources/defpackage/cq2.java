package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class cq2 {
    public final ka PxuCJdSBwIXG;
    public final ka TSizfFm2Yiuu;
    public final ka lS5Rgt96tfkO;

    public cq2(ka kaVar, ka kaVar2, ka kaVar3) {
        this.PxuCJdSBwIXG = kaVar;
        this.lS5Rgt96tfkO = kaVar2;
        this.TSizfFm2Yiuu = kaVar3;
    }

    public final void OPXfSBeufaJ8(eq2 eq2Var) {
        if (eq2Var == null) {
            ((dq2) this).e9gEMXR7LXtO.writeString(null);
            return;
        }
        try {
            ((dq2) this).e9gEMXR7LXtO.writeString(lS5Rgt96tfkO(eq2Var.getClass()).getName());
            dq2 PxuCJdSBwIXG = PxuCJdSBwIXG();
            try {
                Y1f8riQaR6yg(eq2Var.getClass()).invoke(null, eq2Var, PxuCJdSBwIXG);
                Parcel parcel = PxuCJdSBwIXG.e9gEMXR7LXtO;
                int i = PxuCJdSBwIXG.OPXfSBeufaJ8;
                if (i >= 0) {
                    int i2 = PxuCJdSBwIXG.Y1f8riQaR6yg.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(eq2Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract dq2 PxuCJdSBwIXG();

    public final eq2 RAsUl2FVSrh6() {
        String readString = ((dq2) this).e9gEMXR7LXtO.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (eq2) TSizfFm2Yiuu(readString).invoke(null, PxuCJdSBwIXG());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Method TSizfFm2Yiuu(String str) {
        ka kaVar = this.PxuCJdSBwIXG;
        Method method = (Method) kaVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cq2.class.getClassLoader()).getDeclaredMethod("read", cq2.class);
        kaVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method Y1f8riQaR6yg(Class cls) {
        String name = cls.getName();
        ka kaVar = this.lS5Rgt96tfkO;
        Method method = (Method) kaVar.get(name);
        if (method != null) {
            return method;
        }
        Class lS5Rgt96tfkO = lS5Rgt96tfkO(cls);
        System.currentTimeMillis();
        Method declaredMethod = lS5Rgt96tfkO.getDeclaredMethod("write", cls, cq2.class);
        kaVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Parcelable a92UlCVFR9N8(Parcelable parcelable, int i) {
        if (!e9gEMXR7LXtO(i)) {
            return parcelable;
        }
        return ((dq2) this).e9gEMXR7LXtO.readParcelable(dq2.class.getClassLoader());
    }

    public abstract boolean e9gEMXR7LXtO(int i);

    public final Class lS5Rgt96tfkO(Class cls) {
        String name = cls.getName();
        ka kaVar = this.TSizfFm2Yiuu;
        Class cls2 = (Class) kaVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        kaVar.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract void rtx2ld2ELZv4(int i);
}
