package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public interface m {

    public static abstract class a implements m {
        protected final boolean hasSingleValue;
        protected final Object value;
        protected final Object[] values;

        public a() {
            this.hasSingleValue = false;
            this.value = null;
            this.values = null;
        }

        @Override // org.greenrobot.greendao.query.m
        public abstract /* synthetic */ void appendTo(StringBuilder sb, String str);

        @Override // org.greenrobot.greendao.query.m
        public void appendValuesTo(List<Object> list) {
            if (this.hasSingleValue) {
                list.add(this.value);
                return;
            }
            Object[] objArr = this.values;
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public a(Object obj) {
            this.value = obj;
            this.hasSingleValue = true;
            this.values = null;
        }

        public a(Object[] objArr) {
            this.value = null;
            this.hasSingleValue = false;
            this.values = objArr;
        }
    }

    public static class b extends a {
        public final String op;
        public final org.greenrobot.greendao.f property;

        public b(org.greenrobot.greendao.f fVar, String str) {
            this.property = fVar;
            this.op = str;
        }

        private static Object checkValueForType(org.greenrobot.greendao.f fVar, Object obj) {
            if (obj != null && obj.getClass().isArray()) {
                throw new DaoException("Illegal value: found array, but simple object required");
            }
            Class<?> cls = fVar.type;
            if (cls == Date.class) {
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Long) {
                    return obj;
                }
                throw new DaoException("Illegal date value: expected java.util.Date or Long for value " + obj);
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    if (intValue != 0 && intValue != 1) {
                        throw new DaoException("Illegal boolean value: numbers must be 0 or 1, but was " + obj);
                    }
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    if ("TRUE".equalsIgnoreCase(str)) {
                        return 1;
                    }
                    if ("FALSE".equalsIgnoreCase(str)) {
                        return 0;
                    }
                    throw new DaoException("Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was " + obj);
                }
            }
            return obj;
        }

        private static Object[] checkValuesForType(org.greenrobot.greendao.f fVar, Object[] objArr) {
            for (int i8 = 0; i8 < objArr.length; i8++) {
                objArr[i8] = checkValueForType(fVar, objArr[i8]);
            }
            return objArr;
        }

        @Override // org.greenrobot.greendao.query.m.a, org.greenrobot.greendao.query.m
        public void appendTo(StringBuilder sb, String str) {
            org.greenrobot.greendao.internal.d.appendProperty(sb, str, this.property).append(this.op);
        }

        public b(org.greenrobot.greendao.f fVar, String str, Object obj) {
            super(checkValueForType(fVar, obj));
            this.property = fVar;
            this.op = str;
        }

        public b(org.greenrobot.greendao.f fVar, String str, Object[] objArr) {
            super(checkValuesForType(fVar, objArr));
            this.property = fVar;
            this.op = str;
        }
    }

    public static class c extends a {
        protected final String string;

        public c(String str) {
            this.string = str;
        }

        @Override // org.greenrobot.greendao.query.m.a, org.greenrobot.greendao.query.m
        public void appendTo(StringBuilder sb, String str) {
            sb.append(this.string);
        }

        public c(String str, Object obj) {
            super(obj);
            this.string = str;
        }

        public c(String str, Object... objArr) {
            super(objArr);
            this.string = str;
        }
    }

    void appendTo(StringBuilder sb, String str);

    void appendValuesTo(List<Object> list);
}
