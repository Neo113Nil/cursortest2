package w1;

import com.baidu.ar.util.SystemInfoUtil;
import java.util.List;

/* loaded from: classes2.dex */
public class h {
    private h() {
    }

    public static String toTplString(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = iArr.length - 1;
        for (int i8 = 0; i8 <= length; i8++) {
            sb.append(iArr[i8]);
            if (i8 < length) {
                sb.append(SystemInfoUtil.COMMA);
            }
        }
        return sb.toString();
    }

    public static String toTplString(List<Integer> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        for (int i8 = 0; i8 <= size; i8++) {
            sb.append(list.get(i8));
            if (i8 < size) {
                sb.append(SystemInfoUtil.COMMA);
            }
        }
        return sb.toString();
    }
}
