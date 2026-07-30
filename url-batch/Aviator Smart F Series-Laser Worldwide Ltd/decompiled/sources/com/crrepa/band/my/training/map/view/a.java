package com.crrepa.band.my.training.map.view;

import android.graphics.Path;
import android.graphics.Point;
import java.util.List;

/* loaded from: classes3.dex */
public class a {
    public static void convertBezierLinePath(Path path, List<Point> list, int i8) {
        float f8 = (100 - i8) / 100.0f;
        float f9 = 1.0f - f8;
        Point point = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        int i9 = 0;
        path.moveTo(list.get(0).x, list.get(0).y);
        int size = list.size();
        while (true) {
            int i10 = size - 1;
            if (i9 >= i10) {
                return;
            }
            int i11 = i9 + 1;
            int i12 = i9 + 2;
            if (i12 < size) {
                i10 = i12;
            }
            convertControlPoint(point, list.get(i9), list.get(i11), f8);
            point2.x = list.get(i11).x;
            point2.y = list.get(i11).y;
            convertControlPoint(point3, list.get(i11), list.get(i10), f9);
            path.cubicTo(point.x, point.y, point2.x, point2.y, point3.x, point3.y);
            i9 = i11;
        }
    }

    private static void convertControlPoint(Point point, Point point2, Point point3, float f8) {
        float f9 = point2.x;
        float f10 = point2.y;
        float f11 = point3.x;
        point.x = (int) (f9 + ((f11 - f9) * f8));
        point.y = (int) (f10 + ((point3.y - f10) * f8));
    }
}
