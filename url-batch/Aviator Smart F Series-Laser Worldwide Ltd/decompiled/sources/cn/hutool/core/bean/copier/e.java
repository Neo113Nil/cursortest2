package cn.hutool.core.bean.copier;

import cn.hutool.core.bean.s;
import cn.hutool.core.lang.q;
import cn.hutool.core.util.e1;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class e extends a {
    private final Type targetType;

    public e(Object obj, Map map, Type type, CopyOptions copyOptions) {
        super(obj, map, copyOptions);
        this.targetType = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copy$0(String str, s sVar) {
        String editFieldName;
        if (str == null || !sVar.isReadable(this.copyOptions.transientSupport) || (editFieldName = this.copyOptions.editFieldName(str)) == null || !this.copyOptions.testKeyFilter(editFieldName)) {
            return;
        }
        Object value = sVar.getValue(this.source);
        if (this.copyOptions.testPropertyFilter(sVar.getField(), value)) {
            Type[] typeArguments = e1.getTypeArguments(this.targetType);
            if (typeArguments != null) {
                value = this.copyOptions.editFieldValue(editFieldName, this.copyOptions.convertField(typeArguments[1], value));
            }
            if (value == null && this.copyOptions.ignoreNullValue) {
                return;
            }
            ((Map) this.target).put(editFieldName, value);
        }
    }

    @Override // cn.hutool.core.bean.copier.a, cn.hutool.core.lang.copier.a
    public Map copy() {
        Class<?> cls = this.source.getClass();
        Class<?> cls2 = this.copyOptions.editable;
        if (cls2 != null) {
            q.isTrue(cls2.isInstance(this.source), "Source class [{}] not assignable to Editable class [{}]", cls.getName(), this.copyOptions.editable.getName());
            cls = this.copyOptions.editable;
        }
        cn.hutool.core.bean.q.getBeanDesc(cls).getPropMap(this.copyOptions.ignoreCase).forEach(new BiConsumer() { // from class: cn.hutool.core.bean.copier.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                e.this.lambda$copy$0((String) obj, (s) obj2);
            }
        });
        return (Map) this.target;
    }
}
