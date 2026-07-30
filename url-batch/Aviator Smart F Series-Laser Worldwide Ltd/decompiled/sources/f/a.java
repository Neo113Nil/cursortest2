package f;

import cn.hutool.core.clone.CloneRuntimeException;

/* loaded from: classes.dex */
public class a implements b {
    @Override // f.b
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new CloneRuntimeException(e8);
        }
    }
}
