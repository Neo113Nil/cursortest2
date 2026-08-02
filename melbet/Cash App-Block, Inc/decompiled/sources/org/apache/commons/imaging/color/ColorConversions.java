package org.apache.commons.imaging.color;

/* loaded from: classes9.dex */
public final class ColorConversions {
    private static final double REF_X = 95.047d;
    private static final double REF_Y = 100.0d;
    private static final double REF_Z = 108.883d;

    private ColorConversions() {
    }

    public static ColorCieLab convertCIELCHtoCIELab(double d, double d2, double d3) {
        return new ColorCieLab(d, Math.cos(degree_2_radian(d3)) * d2, Math.sin(degree_2_radian(d3)) * d2);
    }

    public static int convertCIELabtoARGBTest(int i, int i2, int i3) {
        double d = (((i * REF_Y) / 255.0d) + 16.0d) / 116.0d;
        double d2 = (i2 / 500.0d) + d;
        double d3 = d - (i3 / 200.0d);
        double cube = cube(d2);
        double cube2 = cube(d);
        double cube3 = cube(d3);
        if (cube2 <= 0.008856d) {
            cube2 = (d - 0.13793103448275862d) / 7.787d;
        }
        if (cube <= 0.008856d) {
            cube = (d2 - 0.13793103448275862d) / 7.787d;
        }
        if (cube3 <= 0.008856d) {
            cube3 = (d3 - 0.13793103448275862d) / 7.787d;
        }
        double d4 = cube * REF_X;
        double d5 = cube2 * REF_Y;
        double d6 = cube3 * REF_Z;
        double d7 = d4 / REF_Y;
        double d8 = d5 / REF_Y;
        double d9 = d6 / REF_Y;
        double d10 = ((-0.4986d) * d9) + ((-1.5372d) * d8) + (3.2406d * d7);
        double d11 = (0.0415d * d9) + (1.8758d * d8) + ((-0.9689d) * d7);
        double d12 = (d9 * 1.057d) + (d8 * (-0.204d)) + (d7 * 0.0557d);
        return convertRGBtoRGB((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d, (d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d, (d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d);
    }

    public static ColorCieLch convertCIELabtoCIELCH(double d, double d2, double d3) {
        double atan2 = Math.atan2(d3, d2);
        return new ColorCieLch(d, Math.sqrt(square(d2) + square(d3)), atan2 > 0.0d ? (atan2 / 3.141592653589793d) * 180.0d : 360.0d - radian_2_degree(Math.abs(atan2)));
    }

    public static ColorXyz convertCIELabtoXYZ(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        return new ColorXyz((Math.pow(d5, 3.0d) > 0.008856d ? Math.pow(d5, 3.0d) : (d5 - 0.13793103448275862d) / 7.787d) * REF_X, (Math.pow(d4, 3.0d) > 0.008856d ? Math.pow(d4, 3.0d) : (d4 - 0.13793103448275862d) / 7.787d) * REF_Y, (Math.pow(d6, 3.0d) > 0.008856d ? Math.pow(d6, 3.0d) : (d6 - 0.13793103448275862d) / 7.787d) * REF_Z);
    }

    public static ColorXyz convertCIELuvtoXYZ(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = 13.0d * d;
        double d6 = (d2 / d5) + 0.19783982482140777d;
        double d7 = (d3 / d5) + 0.46833630293240974d;
        double pow = (Math.pow(d4, 3.0d) > 0.008856d ? Math.pow(d4, 3.0d) : (d4 - 0.0d) / 7.787d) * REF_Y;
        double d8 = 9.0d * pow;
        double d9 = (-(d8 * d6)) / (((d6 - 4.0d) * d7) - (d6 * d7));
        return new ColorXyz(d9, pow, ((d8 - ((15.0d * d7) * pow)) - (d7 * d9)) / (d7 * 3.0d));
    }

    public static ColorCmy convertCMYKtoCMY(double d, double d2, double d3, double d4) {
        double d5 = 1.0d - d4;
        return new ColorCmy((d * d5) + d4, (d2 * d5) + d4, (d5 * d3) + d4);
    }

    public static int convertCMYKtoRGB(int i, int i2, int i3, int i4) {
        return convertCMYtoRGB(convertCMYKtoCMY(i / 255.0d, i2 / 255.0d, i3 / 255.0d, i4 / 255.0d));
    }

    public static int convertCMYKtoRGB_Adobe(int i, int i2, int i3, int i4) {
        return convertRGBtoRGB(255 - (i + i4), 255 - (i2 + i4), 255 - (i3 + i4));
    }

    public static ColorCmyk convertCMYtoCMYK(ColorCmy colorCmy) {
        double d;
        double d2;
        double d3;
        double d4 = colorCmy.C;
        double d5 = colorCmy.M;
        double d6 = colorCmy.Y;
        double d7 = d4 < 1.0d ? d4 : 1.0d;
        if (d5 < d7) {
            d7 = d5;
        }
        double d8 = d6 < d7 ? d6 : d7;
        if (d8 == 1.0d) {
            d = 0.0d;
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            double d9 = 1.0d - d8;
            d = (d4 - d8) / d9;
            d2 = (d5 - d8) / d9;
            d3 = (d6 - d8) / d9;
        }
        return new ColorCmyk(d, d2, d3, d8);
    }

    public static int convertCMYtoRGB(ColorCmy colorCmy) {
        return convertRGBtoRGB((1.0d - colorCmy.C) * 255.0d, (1.0d - colorCmy.M) * 255.0d, (1.0d - colorCmy.Y) * 255.0d);
    }

    public static int convertHSLtoRGB(double d, double d2, double d3) {
        double convertHuetoRGB;
        double convertHuetoRGB2;
        double d4;
        if (d2 == 0.0d) {
            d4 = d3 * 255.0d;
            convertHuetoRGB = d4;
            convertHuetoRGB2 = convertHuetoRGB;
        } else {
            double d5 = d3 < 0.5d ? (d2 + 1.0d) * d3 : (d3 + d2) - (d2 * d3);
            double d6 = (d3 * 2.0d) - d5;
            double convertHuetoRGB3 = convertHuetoRGB(d6, d5, d + 0.3333333333333333d) * 255.0d;
            convertHuetoRGB = convertHuetoRGB(d6, d5, d) * 255.0d;
            convertHuetoRGB2 = convertHuetoRGB(d6, d5, d - 0.3333333333333333d) * 255.0d;
            d4 = convertHuetoRGB3;
        }
        return convertRGBtoRGB(d4, convertHuetoRGB, convertHuetoRGB2);
    }

    public static int convertHSVtoRGB(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (d2 == 0.0d) {
            d4 = d3 * 255.0d;
            d6 = d4;
            d5 = d6;
        } else {
            double d7 = d * 6.0d;
            if (d7 == 6.0d) {
                d7 = 0.0d;
            }
            double floor = Math.floor(d7);
            double d8 = (1.0d - d2) * d3;
            double d9 = d7 - floor;
            double d10 = (1.0d - (d2 * d9)) * d3;
            double d11 = (1.0d - ((1.0d - d9) * d2)) * d3;
            if (floor == 0.0d) {
                d10 = d11;
                d11 = d8;
            } else {
                if (floor == 1.0d) {
                    d11 = d8;
                    d8 = d10;
                } else if (floor != 2.0d) {
                    if (floor != 3.0d) {
                        if (floor == 4.0d) {
                            d10 = d8;
                            d8 = d11;
                        } else {
                            d11 = d10;
                            d10 = d8;
                        }
                    }
                    d11 = d3;
                    d4 = d8 * 255.0d;
                    d5 = d11 * 255.0d;
                    d6 = d10 * 255.0d;
                }
                d10 = d3;
                d4 = d8 * 255.0d;
                d5 = d11 * 255.0d;
                d6 = d10 * 255.0d;
            }
            d8 = d3;
            d4 = d8 * 255.0d;
            d5 = d11 * 255.0d;
            d6 = d10 * 255.0d;
        }
        return convertRGBtoRGB(d4, d6, d5);
    }

    private static double convertHuetoRGB(double d, double d2, double d3) {
        if (d3 < 0.0d) {
            d3 += 1.0d;
        }
        if (d3 > 1.0d) {
            d3 -= 1.0d;
        }
        if (d3 * 6.0d < 1.0d) {
            return ((d2 - d) * 6.0d * d3) + d;
        }
        if (d3 * 2.0d < 1.0d) {
            return d2;
        }
        if (3.0d * d3 >= 2.0d) {
            return d;
        }
        return ((0.6666666666666666d - d3) * (d2 - d) * 6.0d) + d;
    }

    public static ColorXyz convertHunterLabtoXYZ(double d, double d2, double d3) {
        double pow = Math.pow(d / 10.0d, 2.0d);
        return new ColorXyz(((((d2 / 17.5d) * d) / 10.0d) + pow) / 1.02d, pow, (-((((d3 / 7.0d) * d) / 10.0d) - pow)) / 0.847d);
    }

    public static ColorCmy convertRGBtoCMY(int i) {
        return new ColorCmy(1.0d - (((i >> 16) & 255) / 255.0d), 1.0d - (((i >> 8) & 255) / 255.0d), 1.0d - ((i & 255) / 255.0d));
    }

    public static ColorHsl convertRGBtoHSL(int i) {
        double d;
        double d2;
        double d3;
        double d4 = ((i >> 16) & 255) / 255.0d;
        double d5 = ((i >> 8) & 255) / 255.0d;
        double d6 = (i & 255) / 255.0d;
        double min = Math.min(d4, Math.min(d5, d6));
        boolean z = true;
        boolean z2 = false;
        if (d4 >= d5 && d4 >= d6) {
            d = d4;
        } else if (d5 > d6) {
            z2 = true;
            z = false;
            d = d5;
        } else {
            d = d6;
            z = false;
        }
        double d7 = d - min;
        double d8 = d + min;
        double d9 = d8 / 2.0d;
        if (d7 == 0.0d) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            if (d9 >= 0.5d) {
                d8 = (2.0d - d) - min;
            }
            double d10 = d7 / d8;
            double d11 = d7 / 2.0d;
            double d12 = (((d - d4) / 6.0d) + d11) / d7;
            double d13 = (((d - d5) / 6.0d) + d11) / d7;
            double d14 = (((d - d6) / 6.0d) + d11) / d7;
            double d15 = z ? d14 - d13 : z2 ? (d12 + 0.3333333333333333d) - d14 : (d13 + 0.6666666666666666d) - d12;
            if (d15 < 0.0d) {
                d15 += 1.0d;
            }
            double d16 = d15;
            if (d16 > 1.0d) {
                d16 -= 1.0d;
            }
            d2 = d10;
            d3 = d16;
        }
        return new ColorHsl(d3, d2, d9);
    }

    public static ColorHsv convertRGBtoHSV(int i) {
        double d;
        double d2;
        double d3;
        double d4 = ((i >> 16) & 255) / 255.0d;
        double d5 = ((i >> 8) & 255) / 255.0d;
        double d6 = (i & 255) / 255.0d;
        double min = Math.min(d4, Math.min(d5, d6));
        boolean z = true;
        boolean z2 = false;
        if (d4 >= d5 && d4 >= d6) {
            d = d4;
        } else if (d5 > d6) {
            z2 = true;
            z = false;
            d = d5;
        } else {
            d = d6;
            z = false;
        }
        double d7 = d - min;
        if (d7 == 0.0d) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            double d8 = d7 / d;
            double d9 = d7 / 2.0d;
            double d10 = (((d - d4) / 6.0d) + d9) / d7;
            double d11 = (((d - d5) / 6.0d) + d9) / d7;
            double d12 = (((d - d6) / 6.0d) + d9) / d7;
            double d13 = z ? d12 - d11 : z2 ? (d10 + 0.3333333333333333d) - d12 : (d11 + 0.6666666666666666d) - d10;
            if (d13 < 0.0d) {
                d13 += 1.0d;
            }
            double d14 = d13;
            if (d14 > 1.0d) {
                d14 -= 1.0d;
            }
            d2 = d8;
            d3 = d14;
        }
        return new ColorHsv(d3, d2, d);
    }

    private static int convertRGBtoRGB(double d, double d2, double d3) {
        int round = (int) Math.round(d);
        int round2 = (int) Math.round(d2);
        int round3 = (int) Math.round(d3);
        return (Math.min(255, Math.max(0, round)) << 16) | (-16777216) | (Math.min(255, Math.max(0, round2)) << 8) | Math.min(255, Math.max(0, round3));
    }

    public static ColorXyz convertRGBtoXYZ(int i) {
        double d = ((i >> 16) & 255) / 255.0d;
        double d2 = ((i >> 8) & 255) / 255.0d;
        double d3 = (i & 255) / 255.0d;
        double pow = d > 0.04045d ? Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d;
        double pow2 = d2 > 0.04045d ? Math.pow((d2 + 0.055d) / 1.055d, 2.4d) : d2 / 12.92d;
        double pow3 = d3 > 0.04045d ? Math.pow((d3 + 0.055d) / 1.055d, 2.4d) : d3 / 12.92d;
        double d4 = pow * REF_Y;
        double d5 = pow2 * REF_Y;
        double d6 = pow3 * REF_Y;
        return new ColorXyz((0.1805d * d6) + (0.3576d * d5) + (0.4124d * d4), (0.0722d * d6) + (0.7152d * d5) + (0.2126d * d4), (d6 * 0.9505d) + (d5 * 0.1192d) + (d4 * 0.0193d));
    }

    public static ColorCieLab convertXYZtoCIELab(double d, double d2, double d3) {
        double d4 = d / REF_X;
        double d5 = d2 / REF_Y;
        double d6 = d3 / REF_Z;
        double pow = d4 > 0.008856d ? Math.pow(d4, 0.3333333333333333d) : (d4 * 7.787d) + 0.13793103448275862d;
        double pow2 = d5 > 0.008856d ? Math.pow(d5, 0.3333333333333333d) : (d5 * 7.787d) + 0.13793103448275862d;
        return new ColorCieLab((116.0d * pow2) - 16.0d, (pow - pow2) * 500.0d, (pow2 - (d6 > 0.008856d ? Math.pow(d6, 0.3333333333333333d) : (d6 * 7.787d) + 0.13793103448275862d)) * 200.0d);
    }

    public static ColorCieLuv convertXYZtoCIELuv(double d, double d2, double d3) {
        double d4 = (d3 * 3.0d) + (15.0d * d2) + d;
        double d5 = (4.0d * d) / d4;
        double d6 = (9.0d * d2) / d4;
        double d7 = d2 / REF_Y;
        double pow = ((d7 > 0.008856d ? Math.pow(d7, 0.3333333333333333d) : (d7 * 7.787d) + 0.13793103448275862d) * 116.0d) - 16.0d;
        double d8 = 13.0d * pow;
        return new ColorCieLuv(pow, (d5 - 0.19783982482140777d) * d8, (d6 - 0.46833630293240974d) * d8);
    }

    public static ColorHunterLab convertXYZtoHunterLab(double d, double d2, double d3) {
        return new ColorHunterLab(Math.sqrt(d2) * 10.0d, (((d * 1.02d) - d2) / Math.sqrt(d2)) * 17.5d, ((d2 - (0.847d * d3)) / Math.sqrt(d2)) * 7.0d);
    }

    public static int convertXYZtoRGB(double d, double d2, double d3) {
        double d4 = d / REF_Y;
        double d5 = d2 / REF_Y;
        double d6 = d3 / REF_Y;
        double d7 = ((-0.4986d) * d6) + ((-1.5372d) * d5) + (3.2406d * d4);
        double d8 = (0.0415d * d6) + (1.8758d * d5) + ((-0.9689d) * d4);
        double d9 = (d6 * 1.057d) + (d5 * (-0.204d)) + (d4 * 0.0557d);
        return convertRGBtoRGB((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d, (d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d, (d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d);
    }

    private static double cube(double d) {
        return d * d * d;
    }

    public static double degree_2_radian(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double radian_2_degree(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    private static double square(double d) {
        return d * d;
    }

    public static ColorCmy convertCMYKtoCMY(ColorCmyk colorCmyk) {
        return convertCMYKtoCMY(colorCmyk.C, colorCmyk.M, colorCmyk.Y, colorCmyk.K);
    }

    public static ColorCieLab convertCIELCHtoCIELab(ColorCieLch colorCieLch) {
        return convertCIELCHtoCIELab(colorCieLch.L, colorCieLch.C, colorCieLch.H);
    }

    public static ColorXyz convertHunterLabtoXYZ(ColorHunterLab colorHunterLab) {
        return convertHunterLabtoXYZ(colorHunterLab.L, colorHunterLab.a, colorHunterLab.b);
    }

    public static ColorHunterLab convertXYZtoHunterLab(ColorXyz colorXyz) {
        return convertXYZtoHunterLab(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    private static int convertRGBtoRGB(int i, int i2, int i3) {
        return (Math.min(255, Math.max(0, i)) << 16) | (-16777216) | (Math.min(255, Math.max(0, i2)) << 8) | Math.min(255, Math.max(0, i3));
    }

    public static ColorCieLch convertCIELabtoCIELCH(ColorCieLab colorCieLab) {
        return convertCIELabtoCIELCH(colorCieLab.L, colorCieLab.a, colorCieLab.b);
    }

    public static int convertHSLtoRGB(ColorHsl colorHsl) {
        return convertHSLtoRGB(colorHsl.H, colorHsl.S, colorHsl.L);
    }

    public static ColorCieLuv convertXYZtoCIELuv(ColorXyz colorXyz) {
        return convertXYZtoCIELuv(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static ColorXyz convertCIELuvtoXYZ(ColorCieLuv colorCieLuv) {
        return convertCIELuvtoXYZ(colorCieLuv.L, colorCieLuv.u, colorCieLuv.v);
    }

    public static ColorCieLab convertXYZtoCIELab(ColorXyz colorXyz) {
        return convertXYZtoCIELab(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }

    public static ColorXyz convertCIELabtoXYZ(ColorCieLab colorCieLab) {
        return convertCIELabtoXYZ(colorCieLab.L, colorCieLab.a, colorCieLab.b);
    }

    public static int convertHSVtoRGB(ColorHsv colorHsv) {
        return convertHSVtoRGB(colorHsv.H, colorHsv.S, colorHsv.V);
    }

    public static int convertXYZtoRGB(ColorXyz colorXyz) {
        return convertXYZtoRGB(colorXyz.X, colorXyz.Y, colorXyz.Z);
    }
}
