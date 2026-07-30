package cn.hutool.core.lang;

import cn.hutool.core.util.e1;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract class y0 implements Type {
    private final Type type = e1.getTypeArgument(getClass());

    public Type getType() {
        return this.type;
    }

    public String toString() {
        return this.type.toString();
    }
}
