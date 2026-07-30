package cn.hutool.core.bean.copier;

import cn.hutool.core.util.e1;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class o extends a {
    private final Type targetType;

    public o(Map map, Map map2, Type type, CopyOptions copyOptions) {
        super(map, map2, copyOptions);
        this.targetType = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copy$0(Object obj, Object obj2) {
        String editFieldName;
        if (obj == null) {
            return;
        }
        CopyOptions copyOptions = this.copyOptions;
        if ((true == copyOptions.ignoreNullValue && obj2 == null) || (editFieldName = copyOptions.editFieldName(obj.toString())) == null || !this.copyOptions.testKeyFilter(editFieldName)) {
            return;
        }
        Object obj3 = ((Map) this.target).get(editFieldName);
        if (this.copyOptions.override || obj3 == null) {
            Type[] typeArguments = e1.getTypeArguments(this.targetType);
            if (typeArguments != null) {
                obj2 = this.copyOptions.editFieldValue(editFieldName, this.copyOptions.convertField(typeArguments[1], obj2));
            }
            ((Map) this.target).put(editFieldName, obj2);
        }
    }

    @Override // cn.hutool.core.bean.copier.a, cn.hutool.core.lang.copier.a
    public Map copy() {
        ((Map) this.source).forEach(new BiConsumer() { // from class: cn.hutool.core.bean.copier.n
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                o.this.lambda$copy$0(obj, obj2);
            }
        });
        return (Map) this.target;
    }
}
