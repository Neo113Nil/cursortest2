package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.l;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    private final char character;
    private final String fontFamily;
    private final List<l> shapes;
    private final double size;
    private final String style;
    private final double width;

    public c(List<l> list, char c8, double d8, double d9, String str, String str2) {
        this.shapes = list;
        this.character = c8;
        this.size = d8;
        this.width = d9;
        this.style = str;
        this.fontFamily = str2;
    }

    public static int hashFor(char c8, String str, String str2) {
        return (((c8 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<l> getShapes() {
        return this.shapes;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return hashFor(this.character, this.fontFamily, this.style);
    }
}
